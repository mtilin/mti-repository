package CommonUtil;

public class ExtensionHandler {
    /***
     * return extension by filepath
     * @param filePath pre-handle excel file's filepath
     * @return extension
     */
    public static String getExtension(String filePath){
        int lastIndex = filePath.lastIndexOf(".");
        String extension = filePath.substring(lastIndex+1);
        return extension;
    }
}
