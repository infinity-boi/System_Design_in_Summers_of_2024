package GS09_DesignPatterns.StructuralDP.ProxyDP.Youtube;

// The GUI class, which used to work directly with a service
// object, stays unchanged as long as it works with the service
// object through an interface.
class YouTubeManager {
    protected ThirdPartyYouTubeLib service;

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(String id) {
        String info = service.getVideoInfo(id);
        // Render the video page with the retrieved info.
        System.out.println("Rendering video page: " + info);
    }

    public void renderListPanel() {
        String list = service.listVideos();
        // Render the list of video thumbnails.
        System.out.println("Rendering list panel: " + list);
    }

    public void reactOnUserInput() {
        renderVideoPage("video1");
        renderListPanel();
    }
}
