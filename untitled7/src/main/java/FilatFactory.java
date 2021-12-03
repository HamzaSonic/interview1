public class FilatFactory {

    public static Filat getFile(String fileName) {
        if (fileName.equals("doc"))
            return new DocFIle();
        if (fileName.equals("xsd"))
            return new XsdFile();
        throw new UnsupportedOperationException();
    }
}
