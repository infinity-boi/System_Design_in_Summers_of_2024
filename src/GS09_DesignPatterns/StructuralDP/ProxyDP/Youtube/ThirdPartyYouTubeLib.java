package GS09_DesignPatterns.StructuralDP.ProxyDP.Youtube;

// The interface of a remote service.
interface ThirdPartyYouTubeLib {
    String listVideos();
    String getVideoInfo(String id);
    void downloadVideo(String id);
}