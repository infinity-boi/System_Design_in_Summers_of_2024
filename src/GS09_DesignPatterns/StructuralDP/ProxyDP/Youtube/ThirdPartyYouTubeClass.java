package GS09_DesignPatterns.StructuralDP.ProxyDP.Youtube;

// The concrete implementation of a service connector. Methods
// of this class can request information from YouTube.
class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    @Override
    public String listVideos() {
        // Simulate sending an API request to YouTube.
        return "List of YouTube videos";
    }

    @Override
    public String getVideoInfo(String id) {
        // Simulate getting metadata about some video.
        return "Video info for " + id;
    }

    @Override
    public void downloadVideo(String id) {
        // Simulate downloading a video file from YouTube.
        System.out.println("Downloading video " + id);
    }
}
