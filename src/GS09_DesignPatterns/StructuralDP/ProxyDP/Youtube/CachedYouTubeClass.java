package GS09_DesignPatterns.StructuralDP.ProxyDP.Youtube;

import java.util.HashMap;
import java.util.Map;
// To save some bandwidth, we can cache request results and keep
// them for some time.
class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib service;
    private String listCache;
    private Map<String, String> videoCache = new HashMap<>();
    private boolean needReset;

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public String listVideos() {
        if (listCache == null || needReset) {
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(String id) {
        if (!videoCache.containsKey(id) || needReset) {
            videoCache.put(id, service.getVideoInfo(id));
        }
        return videoCache.get(id);
    }

    @Override
    public void downloadVideo(String id) {
        if (!downloadExists(id) || needReset) {
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(String id) {
        // Simulate checking if the video has been downloaded.
        // In a real application, this would check the filesystem or a database.
        return videoCache.containsKey(id);
    }
}
