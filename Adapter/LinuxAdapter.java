public class LinuxAdapter implements Windows
{
    Linux linux;
    
    public  LinuxAdapter(Linux linux){
        this.linux = linux;
    }
    
    public void print(String text){
        linux.write(text);
    }
    
    public String getStatus(){
        return Integer.toString(linux.status());
    }
    
}
