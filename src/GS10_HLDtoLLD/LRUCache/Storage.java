package GS10_HLDtoLLD.LRUCache;

public interface Storage {
    Object read(String key);
    void write(String key,Object value);
}
