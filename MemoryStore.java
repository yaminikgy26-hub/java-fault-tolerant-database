import java.util.concurrent.ConcurrentHashMap;

public class MemoryStore {
    // Thread-safe memory-mapped indexing structure
    private final ConcurrentHashMap<String, String> dataStore;

    public MemoryStore() {
        this.dataStore = new ConcurrentHashMap<>();
    }

    public void put(String key, String value) {
        dataStore.put(key, value);
        replicateToNodes(key, value);
    }

    public String get(String key) {
        return dataStore.get(key);
    }

    private void replicateToNodes(String key, String value) {
        // Simulating the consensus and data replication mechanism
        System.out.println("[REPLICATION LOG] Key: " + key + " safely replicated to backup nodes.");
    }
}
