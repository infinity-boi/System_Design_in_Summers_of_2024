package GS09_DesignPatterns.StructuralDP.ProxyDP.Youtube;

// The application that can configure proxies on the fly.
class Application {
    public void init() {
        ThirdPartyYouTubeLib aYouTubeService = new ThirdPartyYouTubeClass();
        ThirdPartyYouTubeLib aYouTubeProxy = new CachedYouTubeClass(aYouTubeService);
        YouTubeManager manager = new YouTubeManager(aYouTubeProxy);
        manager.reactOnUserInput();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.init();
    }
}
