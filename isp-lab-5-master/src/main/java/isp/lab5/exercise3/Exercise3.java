package isp.lab5.exercise3;

interface Playable {
    void play();
}

class ColorVideo implements Playable {

    private String fileName;

    public ColorVideo(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void play() {
        System.out.println("Play " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading video..." + fileName);
    }
}

class ProxyVideo implements Playable {

    private Playable video;
    private String fileName;
   

    public ProxyVideo(String fileName,  boolean whatTypeofVideo){
        this.fileName = fileName;
        if(whatTypeofVideo == true){
            this.video = new ColorVideo(fileName);
        }
        else{
            this.video = new BlackAndWhiteVideo();
        }
    }

    @Override
    public void play() {
        if(video == null){
            video = new ColorVideo(fileName);
        }
        video.play();
    }
}

class BlackAndWhiteVideo implements Playable{
    
    private ColorVideo video;

    @Override
    public void play() {
        System.out.println("Play black and white video "+ video); 
    } 
}

public class Exercise3 {
    public static void main(String[] args){
         Playable p = new ProxyVideo("GUN'N Roses", true);
    }
    
}

