
package com.ge.example.richfaces.hello.jboss7;

import java.io.Serializable;

public class Bean
    implements Serializable
{

    public Bean()
    {
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    private String text;
}
