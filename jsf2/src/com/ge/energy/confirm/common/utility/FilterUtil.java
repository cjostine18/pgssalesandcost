/**
 * Project:      PGS - AA
 * Component:    FilterUtil.java
 * Date-Written: June 18th, 2012
 * Security:     GE-Confidential
 * Restrictions: GE PROPRIETARY INFORMATION, FOR GE USE ONLY
 *
 *     ****************************************************
 *     *  Copyright (C) 2012 General Electric Company     *
 *     *           All rights reserved                    *
 *     ****************************************************
 *
 */
package com.ge.energy.confirm.common.utility;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.faces.model.SelectItem;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * @author 806101
 * 
 *         FilterUtil used for filter function
 * 
 */
public class FilterUtil {
	private static final Logger LOGGER = Logger.getLogger(FilterUtil.class);
	public static final String MARK = "$";
	public static final String MARKS = "@";
	public static final String BLANK = "[Blank]";
	public static final String FILTER = "Filter";
	public static final String IMAGE_ALL = PGSUtil
			.getValueByProp(Constants.FILTER_ALL);
	public static final String IMAGES = PGSUtil
			.getValueByProp(Constants.FILTERS);
	public static final List<String> BUCKETS = new ArrayList<String>();
	static {
		BUCKETS.add("modelBucket");
		BUCKETS.add("catalogBucket");
		BUCKETS.add("taskCode");
		BUCKETS.add("extWorkBusReason");
		BUCKETS.add("feeTypeBillingCode");
		BUCKETS.add("subFeeType");
		BUCKETS.add("invCtgry");
	}

	/**
	 * adding a private constructor to silence PMD warning
	 */
	private FilterUtil() {

	}

	/**
	 * <p>
	 * Title: loadModalPanelData
	 * </p>
	 * <p>
	 * Description: Load data for modal panel.
	 * </p>
	 * 
	 * @param obj
	 * @param popupParam
	 * @param allBeans
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return ArrayList<Object>[]
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Object>[] loadModalPanelData(Object obj,
			String popupParam, List<?> allBeans) throws NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		ArrayList<Object> panelItems = new ArrayList<Object>();
		ArrayList<Object> selectItems = new ArrayList<Object>();
		Set<Object> dataSet = getFiltersFromDatas(obj, popupParam, allBeans);
		if (null != dataSet && !dataSet.isEmpty()) {
			for (Object object : dataSet) {
				if (BUCKETS.contains(popupParam) || BLANK.equals(object)) {
					String[] value = getIdAndName(object);
					if (null != value && StringUtils.isNotBlank(value[1])) {
						panelItems.add(new SelectItem(value[0], value[1]));
						selectItems.add(value[0]);
					} else {
						panelItems.add(new SelectItem(BLANK));
						selectItems.add(BLANK);
					}
				} else {
					if (object == null) {
						panelItems.add(new SelectItem(BLANK));
						selectItems.add(BLANK);
					} else {
						panelItems.add(new SelectItem(object));
						selectItems.add(object);
					}
				}
			}
		}
		return new ArrayList[] { panelItems, selectItems };
	}

	/**
	 * <p>
	 * Title: selectedModalPanelData
	 * </p>
	 * <p>
	 * Description: Selected modal panel data.
	 * </p>
	 * 
	 * @param obj
	 * @param popupParam
	 * @param allBeans
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return ArrayList<Object>
	 */
	public static ArrayList<Object> selectedModalPanelData(Object obj,
			String popupParam, List<?> allBeans) throws NoSuchMethodException,
			IllegalAccessException, InvocationTargetException {
		ArrayList<Object> selectItems = new ArrayList<Object>();
		Set<Object> dataSet = getFiltersFromDatas(obj, popupParam, allBeans);
		if (null != dataSet && !dataSet.isEmpty()) {
			for (Object object : dataSet) {
				if (BUCKETS.contains(popupParam) || BLANK.equals(object)) {
					String[] value = getIdAndName(object);
					if (null != value && !selectItems.contains(value[0])) {
						selectItems.add(value[0]);
					} else {
						selectItems.add(BLANK);
					}
				} else {
					if (object == null) {
						selectItems.add(BLANK);
					} else {
						selectItems.add(object);
					}
				}
			}
		}
		return selectItems;
	}

	public static String getMethodName(Field field) {
		String first = "get";
		if (field.getType().equals(boolean.class)
				|| field.getType().equals(Boolean.class)) {
			first = "is";
		}
		String fieldName = field.getName();
		String methodName = first
				+ StringUtils.substring(fieldName, 0, 1).toUpperCase(Locale.US)
				+ StringUtils.substring(fieldName, 1);
		return methodName;
	}

	/**
	 * <p>
	 * Title: getFiltersFromDatas
	 * </p>
	 * <p>
	 * Description: Get details.
	 * </p>
	 * 
	 * @param obj
	 * @param popupParam
	 * @param allBeans
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return Set<Object>
	 */
	private static Set<Object> getFiltersFromDatas(Object obj,
			String popupParam, List<?> allBeans) throws IllegalAccessException,
			InvocationTargetException {
		if (obj == null || StringUtils.isBlank(popupParam) || allBeans == null) {
			return null;
		}
		Set<Object> dataSet = new TreeSet<Object>();
		String className = obj.toString().substring(5).trim();
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e1) {
			LOGGER.error(e1.getMessage());
			return null;
		}

		try {
			Field field = clazz.getDeclaredField(popupParam);
			Class<?> type = field.getType();
			for (Object bean : allBeans) {
				Class<?> clazzBean = Class.forName(bean.getClass().toString()
						.substring(5).trim());
				Method method = clazzBean
						.getDeclaredMethod(getMethodName(field));
				if (null != method) {
					if (type.equals(long.class) || type.equals(Long.class)) {
						Object var = method.invoke(bean);
						if (null != var) {
							dataSet.add(Long.valueOf(var.toString().trim()));
						}
					} else if (type.equals(String.class)) {
						Object var = method.invoke(bean);
						if (null == var || StringUtils.isBlank(var.toString())) {
							dataSet.add(BLANK);
						} else {
							if (var.toString().endsWith(MARK)) {
								dataSet.add(BLANK);
							} else {
								dataSet.add(PGSUtil.removeSpac(var.toString()));
							}
						}
					} else if (type.equals(int.class)
							|| type.equals(Integer.class)) {
						Object var = method.invoke(bean);
						if (null != var) {
							dataSet.add(Integer.valueOf(var.toString().trim()));
						}
					} else if (type.equals(double.class)
							|| type.equals(Double.class)) {
						Object var = method.invoke(bean);
						if (null != var) {
							dataSet.add(Double.valueOf(var.toString().trim()));
						}
					} else if (type.equals(boolean.class)
							|| type.equals(Boolean.class)) {
						Object var = method.invoke(bean);
						if (null != var) {
							dataSet.add(var.toString().trim());
						}
					}
				}
			}
		} catch (ClassNotFoundException e) {
			LOGGER.error(e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error(e.getMessage());
		} catch (SecurityException e) {
			LOGGER.error(e.getMessage());
		} catch (NoSuchFieldException e) {
			LOGGER.error(e.getMessage());
		} catch (NoSuchMethodException e) {
			LOGGER.error(e.getMessage());
		}
		return dataSet;
	}

	/**
	 * <p>
	 * Title: loadFilterTableData
	 * </p>
	 * <p>
	 * Description: Load data for dataTable.
	 * </p>
	 * 
	 * @param obj
	 * @param popupParam
	 * @param allBeans
	 * @param selecteds
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return List<?>
	 */
	public static List<?> loadFilterTableData(Object obj, String popupParam,
			List<?> allBeans, List<?> selecteds)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (obj == null || StringUtils.isBlank(popupParam) || allBeans == null
				|| selecteds == null) {
			return null;
		}
		String className = obj.toString().substring(5).trim();
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
		List<Object> datas = new ArrayList<Object>();
		try {
			Field field = clazz.getDeclaredField(popupParam);
			Class<?> type = field.getType();
			for (Object bean : allBeans) {
				Method method = null;
				try {
					Class<?> clazzBean = Class.forName(bean.getClass()
							.toString().substring(5).trim());
					method = clazzBean.getDeclaredMethod(getMethodName(field));
				} catch (ClassNotFoundException e) {
					LOGGER.error(e.getMessage());
				} catch (NoSuchMethodException e) {
					LOGGER.error(e.getMessage());
				}
				for (Object select : selecteds) {
					if (type.equals(long.class) || type.equals(Long.class)) {
						Object var = method.invoke(bean);
						if (null != var) {
							long value = Long.parseLong(var.toString().trim());
							if (value == Long.parseLong(select.toString())) {
								datas.add(bean);
							}
						}

					} else if (type.equals(String.class)) {
						String value = null;
						if (null != method) {
							value = (String) method.invoke(bean);
						}
						if (BUCKETS.contains(popupParam)) {
							if (null != value && value.contains(MARK)) {
								String[] array = getIdAndName(value);
								String id = array[0];
								if (id.equalsIgnoreCase(select.toString())) {
									datas.add(bean);
								}
							}
						} else {
							if (null == value) {
								if (BLANK.equals(select)) {
									datas.add(bean);
								}
							} else {
								if (value.equals(select.toString())
										|| (StringUtils.isBlank(value) && BLANK
												.equals(select))) {
									datas.add(bean);
								}
							}
						}
					} else if (type.equals(int.class)
							|| type.equals(Integer.class)) {
						Object var = method.invoke(bean);
						if (null != method && null != var) {
							int value = Integer.parseInt(var.toString().trim());
							if (value == Integer.parseInt(select.toString())) {
								datas.add(bean);
							}
						}

					} else if (type.equals(double.class)
							|| type.equals(Double.class)) {
						double value = 0.0;
						Object var = method.invoke(bean);
						if (null != method && null != var) {
							value = new Double(var.toString().trim());
						}
						if (null != select
								&& !StringUtils.isEmpty(select.toString())) {
							double selectValue = new Double(select.toString());
							if (Math.abs(selectValue - value) < Constants.COMPARE_DIFF) {
								datas.add(bean);
							}
						}
					} else if (type.equals(boolean.class)
							|| type.equals(Boolean.class)) {
						boolean value = false;
						Object var = method.invoke(bean);
						if (null != method && null != var) {
							value = Boolean.parseBoolean(var.toString().trim());
						}
						if (value == Boolean.parseBoolean(select.toString())) {
							datas.add(bean);
						}
					}

				}
			}
		} catch (SecurityException e1) {
			LOGGER.error(e1.getMessage());
		} catch (NoSuchFieldException e1) {
			LOGGER.error(e1.getMessage());
		}
		return datas;
	}

	public static List<?> loadFilterTableData(Object obj, List<?> allBeans,
			HashMap<String, List<Object>> filterMap)
			throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		if (obj == null || allBeans == null) {
			return null;
		}
		String className = obj.toString().substring(5).trim();
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			LOGGER.error(e.getMessage());
			return null;
		}
		// Get data
		Set<Map.Entry<String, List<Object>>> filterSet = filterMap.entrySet();
		for (Iterator<Map.Entry<String, List<Object>>> it = filterSet
				.iterator(); it.hasNext();) {
			Map.Entry<String, List<Object>> columns = (Map.Entry<String, List<Object>>) it
					.next();
			String columnName = columns.getKey();
			List<Object> filters = columns.getValue();

			try {
				Field field = clazz.getDeclaredField(columnName);
				Class<?> type = field.getType();
				List<Object> tempList = new ArrayList<Object>();
				for (Object bean : allBeans) {
					Method method = null;
					try {
						Class<?> clazzBean = Class.forName(bean.getClass()
								.toString().substring(5).trim());
						method = clazzBean
								.getDeclaredMethod(getMethodName(field));
					} catch (ClassNotFoundException e) {
						LOGGER.error(e.getMessage());
					} catch (NoSuchMethodException e) {
						LOGGER.error(e.getMessage());
					}
					for (Object select : filters) {
						if (type.equals(long.class) || type.equals(Long.class)) {
							Object var = method.invoke(bean);
							if (null != var) {
								long value = Long.parseLong(var.toString()
										.trim());
								if (value == Long.parseLong(select.toString())) {
									tempList.add(bean);
								}
							}

						} else if (type.equals(String.class)) {
							String value = null;
							if (null != method) {
								value = (String) method.invoke(bean);
							}
							if (BUCKETS.contains(columnName)) {
								if (null != value && value.contains(MARK)) {
									String id = value.substring(0,
											value.indexOf(MARK));
									if (id.equalsIgnoreCase(select.toString())
											|| StringUtils.isBlank(id)) {
										tempList.add(bean);
									}
								}
							} else {
								if (null == value) {
									if (BLANK.equals(select)) {
										tempList.add(bean);
									}
								} else {
									if (value.equals(select.toString())
											|| (StringUtils.isBlank(value) && BLANK
													.equals(select))) {
										tempList.add(bean);
									}
								}
							}
						} else if (type.equals(int.class)
								|| type.equals(Integer.class)) {
							Object var = method.invoke(bean);
							if (null != method && null != var) {
								int value = Integer.parseInt(var.toString()
										.trim());
								if (value == Integer
										.parseInt(select.toString())) {
									tempList.add(bean);
								}
							}

						} else if (type.equals(double.class)
								|| type.equals(Double.class)) {
							double value = 0.0;
							Object var = method.invoke(bean);
							if (null != method && null != var) {
								value = new Double(var.toString().trim());
							}
							if (null != select
									&& !StringUtils.isEmpty(select.toString())) {
								double selectValue = new Double(
										select.toString());
								if (Math.abs(selectValue - value) < Constants.COMPARE_DIFF) {
									tempList.add(bean);
								}
							}
						} else if (type.equals(boolean.class)
								|| type.equals(Boolean.class)) {
							boolean value = false;
							Object var = method.invoke(bean);
							if (null != method && null != var) {
								value = Boolean.parseBoolean(var.toString()
										.trim());
							}
							if (value == Boolean
									.parseBoolean(select.toString())) {
								tempList.add(bean);
							}
						}

					}
				}
				allBeans = tempList;
			} catch (SecurityException e1) {
				LOGGER.error(e1.getMessage());
			} catch (NoSuchFieldException e1) {
				LOGGER.error(e1.getMessage());
			}
		}
		return allBeans;
	}

	/**
	 * <p>
	 * Title: searchByfilterVar
	 * </p>
	 * <p>
	 * Description: Search data by filterVar.
	 * </p>
	 * 
	 * @param filterVar
	 * @param popupParam
	 * @param mPanelItems
	 * @param selecteds
	 * @param modelList
	 * @param selectedAll
	 * @param obj
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return ArrayList<Object>
	 */
	public static ArrayList<Object> searchByfilterVar(String filterVar,
			String popupParam, ArrayList<Object> mPanelItems,
			List<Object> selecteds, List<?> modelList,
			List<Object> selectedAll, Class<?> obj)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		ArrayList<Object> items = new ArrayList<Object>();
		if (StringUtils.isNotBlank(filterVar)) {
			if (BUCKETS.contains(popupParam)) {
				for (Object object : mPanelItems) {
					SelectItem item = (SelectItem) object;
					String lable = item.getLabel();
					if (StringUtils.lowerCase(lable).contains(
							StringUtils.lowerCase(filterVar))) {
						items.add(item);
					}
				}
			} else {
				for (Object object : selecteds) {
					if (StringUtils.lowerCase(object.toString()).contains(
							StringUtils.lowerCase(filterVar))) {
						items.add(new SelectItem(object.toString()));
					}
				}
			}
		} else {
			if (BUCKETS.contains(popupParam)) {
				items = loadModalPanelData(obj, popupParam, modelList)[0];
			} else {
				for (Object object : selectedAll) {
					if (StringUtils.lowerCase(object.toString()).contains(
							StringUtils.lowerCase(filterVar))) {
						items.add(new SelectItem(object.toString()));
					}
				}
			}
		}
		return items;
	}

	/**
	 * <p>
	 * Title: searchByfilterVar
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param filterVar
	 * @param selecteds
	 * @param selectedAll
	 * @throws NoSuchMethodException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @return ArrayList<Object>
	 */
	public static ArrayList<Object> searchByfilterVar(String filterVar,
			List<Object> selecteds, List<Object> selectedAll)
			throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException {
		ArrayList<Object> items = new ArrayList<Object>();
		if (StringUtils.isNotBlank(filterVar)) {
			for (Object object : selecteds) {
				if (StringUtils.lowerCase(object.toString()).contains(
						StringUtils.lowerCase(filterVar))) {
					items.add(new SelectItem(object.toString()));
				}
			}
		} else {
			for (Object object : selectedAll) {
				if (StringUtils.lowerCase(object.toString()).contains(
						StringUtils.lowerCase(filterVar))) {
					items.add(new SelectItem(PGSUtil.removeSpac(object.toString())));
				}
			}
		}
		return items;
	}

	/**
	 * @param object
	 * @return String[]
	 */
	public static String[] getIdAndName(Object object) {
		if(BLANK.equals(object)){
			return null;
		}
		String[] value = null;
		String objValue = object.toString();
		String id = null;
		String name = null;
		if (objValue.contains(MARK)) {
			String idVar = objValue.substring(0, objValue.indexOf(MARK));
			if (StringUtils.isNotBlank(idVar)) {
				id = idVar;
			} else {
				id = "";
			}
			String nameVar = objValue.substring(objValue.indexOf(MARK) + 1);
			if (StringUtils.isNotBlank(nameVar)) {
				name = nameVar;
			} else {
				name = "";
			}
		}
		if (StringUtils.isNotBlank(id)) {
			value = new String[2];
			value[0] = id;
			value[1] = name;
		} else {
			value = new String[2];
			value[0] = "0";
			value[1] = name;
		}
		return value;
	}

	/**
	 * <p>
	 * Title: getDropDown
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 * @param name
	 * @param type
	 * @return
	 * @return SelectItem
	 */
	public static SelectItem getSeItem(String id, String name, Boolean disable) {
		SelectItem item = null;
		if (disable) {
			item = new SelectItem(id + MARK + name, name);
			item.setDisabled(true);
		} else {
			item = new SelectItem(id + MARK + name, name);
		}
		return item;
	}

	/**
	 * <p>
	 * Title: getItemBuckets
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param id
	 * @param name
	 * @param flag
	 * @return
	 * @return SelectItem
	 */
	public static SelectItem getItemBuckets(long id, String name, String flag) {
		SelectItem item = null;
		String value = id + FilterUtil.MARK;
		if (id > 0 && StringUtils.isNotBlank(name)) {
			value += name.trim();
			item = new SelectItem(value, name.trim());
			if ("Y".equals(flag)) {
				item.setDisabled(true);
			}

		} else {
			if (StringUtils.isBlank(name)) {
				value += FilterUtil.BLANK;
				item = new SelectItem(value, FilterUtil.BLANK);
				item.setDisabled(true);
			}
		}
		return item;
	}

	/**
	 * <p>
	 * Title: getfieldName
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param filtFiled
	 * @return
	 * @return Object[]
	 */
	private static Object[] getfieldName(String filtFiled) {
		String fieldName = null;
		boolean returnFlag = false;
		if ("modelNum".equals(filtFiled) || "me_modelNum".equals(filtFiled)) {
			fieldName = "Model Id";
			returnFlag = true;
		}
		if ("tskCd".equals(filtFiled)) {
			fieldName = "Task Code";
			returnFlag = true;
		}
		if ("pal".equals(filtFiled)) {
			fieldName = "P&L";
			returnFlag = true;
		}
		if ("outInInd".equals(filtFiled)) {
			fieldName = "Outstanding";
			returnFlag = true;
		}
		if ("meDesc".equals(filtFiled) || "me".equals(filtFiled)
				|| "me_me".equals(filtFiled) || "meCount".equals(filtFiled)) {
			fieldName = "ME";
			returnFlag = true;
		}
		return new Object[] { returnFlag, fieldName };
	}

	/**
	 * <p>
	 * Title: getFilterNameByfield
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param filterFiled
	 * @return String
	 * @throws Exception
	 */
	public static String getFilterNameByfield(String filtFiled)
			throws Exception {
		String filter = "";
		StringBuffer sBuffer = new StringBuffer();
		String filterFiled = filtFiled;
		if (StringUtils.isNotBlank(filterFiled)) {
			if (filterFiled.startsWith(Constants.ME_UNDERLINE)) {
				filterFiled = filterFiled.substring(
						Constants.ME_UNDERLINE.length()).trim();
			}
			if (filterFiled.startsWith(Constants.APPROVE_UNDERLINE)) {
				filterFiled = filterFiled.substring(
						Constants.APPROVE_UNDERLINE.length()).trim();
			}
			Object[] filedName = getfieldName(filterFiled);
			if ((Boolean) filedName[0]) {
				return String.valueOf(filedName[1]);
			}
			while (true) {
				int index = getUppercaseIndex(filterFiled);
				if (index > Constants.MINUS_ONE) {
					sBuffer.append(filterFiled.substring(0, index));
					sBuffer.append(" ");
					sBuffer.append(filterFiled.charAt(index));
					filterFiled = filterFiled.substring(index + 1);
				} else {
					sBuffer.append(filterFiled);
					break;
				}
			}
			filter = sBuffer.toString();
			filter = StringUtils.substring(filter, 0, 1).toUpperCase(Locale.US)
					+ StringUtils.substring(filter, 1);
		}
		return filter;
	}

	/**
	 * <p>
	 * Title: getUppercaseIndex
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param field
	 * @return index
	 * 
	 */
	private static int getUppercaseIndex(String field) {
		for (int i = 0; i < field.length(); i++) {
			char chat = field.charAt(i);
			if (!Character.isLowerCase(chat)) {
				return i;
			}
		}
		return Constants.MINUS_ONE;
	}

	/**
	 * <p>
	 * Title: getFilterImage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param popupParam
	 * @param selectFlag
	 * @param filterVO
	 * @param methodFilters
	 * @return Object
	 */
	public static Object getFilterImage(String popupParam, boolean selectFlag,
			Object filterVO, Set<Method> methodFilters) {
		if (filterVO == null)
			return filterVO;
		String className = filterVO.toString().substring(5).trim();
		Class<?> clazz = null;
		Object dataVO = null;
		try {
			clazz = Class.forName(className);
			dataVO = clazz.newInstance();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		if (clazz == null) {
			return filterVO;
		}
		Field[] fields = clazz.getDeclaredFields();
		// List<Method> methodFilters = new ArrayList<Method>(methods);

		// When click filter picture
		if (StringUtils.isNotBlank(popupParam)) {
			String param = popupParam + FILTER;
			try {
				Field field = clazz.getDeclaredField(param);
				String fieldName = field.getName();
				PropertyDescriptor pd = new PropertyDescriptor(fieldName, clazz);
				Method methodFilter = pd.getWriteMethod();
				methodFilters.add(methodFilter);
				if (selectFlag) {
					methodFilter.invoke(dataVO, IMAGE_ALL);
				} else {
					methodFilter.invoke(dataVO, IMAGES);
				}
			} catch (Exception e1) {
				LOGGER.error(e1.getMessage());
			}
		}
		if (selectFlag) {
			methodFilters.clear();
		}
		// load filter picture for current table.
		for (int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++) {
			Field field = fields[fieldIndex];
			String fieldName = field.getName();
			if (fieldName.endsWith(FILTER)) {
				try {
					PropertyDescriptor pd = new PropertyDescriptor(fieldName,
							clazz);
					Method method = pd.getWriteMethod();
					if (!methodFilters.contains(method)) {
						method.invoke(dataVO, IMAGE_ALL);
					} else {
						method.invoke(dataVO, IMAGES);
					}
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
				}
			}
		}
		return dataVO;
	}

	/**
	 * <p>
	 * Title: getFilterImage
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param popupParam
	 * @param selectFlag
	 * @param filterVO
	 * @param methodFilters
	 * @param filterList
	 * @return Object
	 */
	public static Object getFilterImage(String popupParam, boolean selectFlag,
			Object filterVO, Set<Method> methodFilters,
			HashMap<String, List<Object>> filterMap) {
		if (filterVO == null)
			return filterVO;
		String className = filterVO.toString().substring(5).trim();
		Class<?> clazz = null;
		Object dataVO = null;
		try {
			clazz = Class.forName(className);
			dataVO = clazz.newInstance();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		if (clazz == null) {
			return filterVO;
		}
		Field[] fields = clazz.getDeclaredFields();
		// List<Method> methodFilters = new ArrayList<Method>(methods);
		int count = 0;
		if (null != filterMap && !filterMap.isEmpty()) {
			Set<Map.Entry<String, List<Object>>> bucketSet = filterMap
					.entrySet();
			for (Iterator<Map.Entry<String, List<Object>>> it = bucketSet
					.iterator(); it.hasNext();) {
				Map.Entry<String, List<Object>> bktEntry = (Map.Entry<String, List<Object>>) it
						.next();
				String paramkey = bktEntry.getKey();

				// When click filter picture
				if (StringUtils.isNotBlank(paramkey)) {
					String param = paramkey + FILTER;
					try {
						Field field = clazz.getDeclaredField(param);
						String fieldName = field.getName();
						PropertyDescriptor pd = new PropertyDescriptor(
								fieldName, clazz);
						Method methodFilter = pd.getWriteMethod();
						methodFilters.add(methodFilter);
						if (selectFlag) {
							methodFilter.invoke(dataVO, IMAGE_ALL);
						} else {
							methodFilter.invoke(dataVO, IMAGES);
						}
						count++;
					} catch (Exception e1) {
						LOGGER.error(e1.getMessage());
					}
				}
			}
		} else {
			// When click filter picture
			if (StringUtils.isNotBlank(popupParam)) {
				String param = popupParam + FILTER;
				try {
					Field field = clazz.getDeclaredField(param);
					String fieldName = field.getName();
					PropertyDescriptor pd = new PropertyDescriptor(fieldName,
							clazz);
					Method methodFilter = pd.getWriteMethod();
					methodFilters.add(methodFilter);
					if (selectFlag) {
						methodFilter.invoke(dataVO, IMAGE_ALL);
					} else {
						methodFilter.invoke(dataVO, IMAGES);
					}
				} catch (Exception e1) {
					LOGGER.error(e1.getMessage());
				}
			}
		}

		if (selectFlag && count == 0) {
			methodFilters.clear();
		}
		// load filter picture for current table.
		for (int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++) {
			Field field = fields[fieldIndex];
			String fieldName = field.getName();
			if (fieldName.endsWith(FILTER)) {
				try {
					PropertyDescriptor pd = new PropertyDescriptor(fieldName,
							clazz);
					Method method = pd.getWriteMethod();
					if (!methodFilters.contains(method)) {
						method.invoke(dataVO, IMAGE_ALL);
					} else {
						method.invoke(dataVO, IMAGES);
					}
				} catch (Exception e) {
					LOGGER.error(e.getMessage());
				}
			}
		}
		return dataVO;
	}
}
