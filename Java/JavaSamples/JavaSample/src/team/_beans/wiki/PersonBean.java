package team._beans.wiki;

/***********************************
* *
* PersonBean.java *
* *
* source - https://ko.wikipedia.org/wiki/자바빈즈
************************************/
public class PersonBean implements java.io.Serializable
{
    private String name;
    private boolean coding;

    // 기본 생성자 (인자가 없는).
    public PersonBean()
    {

    }
    
    // set / get 

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // Different semantics for a boolean field (is vs. get)

    public boolean isCoding()
    {
        return this.coding;
    }

    public void setCoding(boolean coding)
    {
        this.coding = coding;
    }
}