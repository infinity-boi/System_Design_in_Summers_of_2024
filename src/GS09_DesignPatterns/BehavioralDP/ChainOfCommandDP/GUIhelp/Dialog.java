package GS09_DesignPatterns.BehavioralDP.ChainOfCommandDP.GUIhelp;

// ...same as above...
class Dialog extends Container {
    private String wikiPageURL;

    public Dialog(String title) {
        // Additional initialization if necessary.
    }

    public void setWikiPageURL(String wikiPageURL) {
        this.wikiPageURL = wikiPageURL;
    }

    @Override
    public void showHelp() {
        if (wikiPageURL != null) {
            System.out.println("Opening wiki page: " + wikiPageURL);
        } else {
            super.showHelp();
        }
    }
}
