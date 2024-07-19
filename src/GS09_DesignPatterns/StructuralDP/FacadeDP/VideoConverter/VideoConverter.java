package GS09_DesignPatterns.StructuralDP.FacadeDP.VideoConverter;

class VideoConverter {
    public File convert(String filename, String format) {
        VideoFile file = new VideoFile(filename);
        Object sourceCodec = new CodecFactory().extract(file);

        Object destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        Object buffer = BitrateReader.read(filename, sourceCodec);
        Object result = BitrateReader.convert(buffer, destinationCodec);
        result = new AudioMixer().fix(result);

        return new File(result);
    }
}

