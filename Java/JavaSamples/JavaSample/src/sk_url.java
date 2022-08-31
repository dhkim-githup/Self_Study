
	import java.io.*;
    import java.net.*;

    class sk_url{
            public static void main(String[] args) {
                try{
                    System.out.println("=======111111111");
                    URL sk = new URL("http://www.speedmall.co.kr/index.html");
                    //URL sk = new URL("http://www.naver.com/");
                    System.out.println("=======222222222");

                    URLConnection skConnection = sk.openConnection();
                    System.out.println("=======333333333");
                    DataInputStream res = new DataInputStream(skConnection.getInputStream());
                    System.out.println("=======444444444");
                    String inputLine;
                    //SimpleDateFormat timeFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");

                    System.out.println("=======555555555");
                    while ((inputLine = res.readLine()) != null){
                        //System.out.println(timeFormat.format(new java.util.Date()));
                        System.out.println(inputLine);
                    }
                    res.close();
                } catch (Exception e){
                    e.printStackTrace();  System.exit(1);
                }
            }
        }
