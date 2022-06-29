package homework26_06;
//Create a class File that will have the following behaviors: open, edit, close. Edit and close are
// implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile
// that will provide specific implementation of open behaviour:
// Example: to open .java file we need notepad++ or sublime text, to open .doc file we need
// Microsoft word to be installed etc
public abstract class File {
    abstract void open();

    void edit(){
        System.out.println("file is edited");
    }

    void close(){
        System.out.println("file is closed");
    }

    static class JavaFile extends File{
        @Override
        void open(){
            System.out.println("to open .java file we need notepad++ or sublime text");
        }
    }
    static class WordFile extends File{
        @Override
        void open(){
            System.out.println("to open .doc file we need Microsoft word to be installed");
        }
    }
    static class PdfFile extends File{
        @Override
        void open(){
            System.out.println("to open .pdf file we need Abode Reader to be installed");
        }
    }

    public static void main(String[] args) {
        File files[]={new JavaFile(), new WordFile(), new PdfFile()};
        for (File file : files) {
            file.open();
        }
    }
}
