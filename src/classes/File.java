package classes;

class MyFile {
    public long size;
    public String name;

    void info() {
        System.out.println("File name:" + name + ", File size:" + size);
    }
}


class MyVideoFile extends MyFile {
    public int duration;

    @Override
    void info() {
        super.info();
        System.out.println("Video duration:" + this.duration);
    }

    void play() {
        System.out.println("Playing:" + this.name);
    }

    void stop() {
        System.out.println("Stop playing:" + this.name);
    }


}

class TestFile {
    public static void main(String[] args) {
        MyVideoFile f = new MyVideoFile();
        f.size = 32115864;
        f.name = "hello.mp4";
        f.duration = 126;
        f.info();
        f.play();
        f.stop();
    }
}


