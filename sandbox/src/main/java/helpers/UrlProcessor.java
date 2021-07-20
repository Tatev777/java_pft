package helpers;

public class UrlProcessor {

  public static String getBaseUrl(Boolean ssl){
    return getUrlWithSubdomain("whotrades", "", ssl);
  }

  public static String getUrlWithSubdomain(String subDomain, String path, Boolean ssl) {
    String url;
//    switch (Environment.getEnv()) {
//      case Environment.ENV_PROD:
        url = "whotrades.com";
//        if (!subDomain.equals( "whotrades" )) {
//          url = subDomain.concat( "." ).concat( url );
//        }
//        break;
//      default:
//        url = subDomain.concat( UrlProcessor.getDomain() );
//        break;
//    }
    return "http" + (ssl ? "s" : "") + "://" + url + "/" + path;
  }

}
