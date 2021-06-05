package team._beans.wiki;

/***********************************
* *
* TestPersonBean.java *
* *
* * source - https://ko.wikipedia.org/wiki/자바빈즈
************************************/

public class TestPersonBean
{
    public static void main(String[] args)
    {

        PersonBean person = new PersonBean();
        person.setName("Bob");
        person.setCoding(true);

        // Output: "Bob [coding]"
        System.out.print(person.getName());
        System.out.println(person.isCoding() ? " [coding]" : "");
    }
}