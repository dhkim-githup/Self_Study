

import java.net.*;
import java.io.*;
import java.util.*;

public class TestURLConnection
{

  public static void main(String[] args) throws Exception {
	  String b_url = "http://kr.yahoo.com/";
	  URL url = new URL(b_url);

    URLConnection httpConn = null;
    BufferedReader in = null;
    PrintWriter out = null;
    try {
      httpConn = url.openConnection();
      httpConn.setDoOutput(true);  // <-- 이것이 핵심입니다.
      httpConn.setUseCaches(false);
      out = new PrintWriter (httpConn.getOutputStream());

      //out.print("name=이원영&address=경기도 부천시 소사구...&msg=Java's Power");
      // It's ok, but how about the following?

      java.util.Hashtable data = new java.util.Hashtable();
      data.put("name", "이원영");
      data.put("address", "경기도 부천시 소사구...");
      data.put("msg", "Java's Power");
      out.print(url_encoding(data));
      out.flush();

      InputStream is = httpConn.getInputStream();
      in = new BufferedReader(new InputStreamReader(is),8*1024);

      String line = null;
      while( (line=in.readLine())!= null ) {
        System.out.println(line);
      }
    }
    finally {
      if ( out != null ) try {out.close();}catch(Exception e){}
      if ( in != null ) try {in.close();}catch(Exception e){}
    }
  }

  public static String url_encoding(java.util.Hashtable hash){
    if ( hash == null ) throw new IllegalArgumentException("argument is null");
    java.util.Enumeration enum1 = hash.keys();
    StringBuffer buf = new StringBuffer();
    boolean isFirst = true;
    while(enum1.hasMoreElements()){
      if (isFirst) isFirst = false;
      else buf.append('&');
      String key = (String)enum1.nextElement();
      String value = (String)hash.get(key);
      buf.append(java.net.URLEncoder.encode(key));
      buf.append('=');
      buf.append(java.net.URLEncoder.encode(value));
    }
    return buf.toString();
  }
}
