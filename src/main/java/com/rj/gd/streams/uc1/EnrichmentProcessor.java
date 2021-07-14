package com.rj.gd.streams.uc1;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.kstream.ValueTransformer;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;

public class EnrichmentProcessor implements ValueTransformer<Object, Object> {

    public static final String STORE_NAME = "CACHED_STORE";

  //  private ProcessorContext ctx;
    private KeyValueStore<String, Object> kvStore;

    public static StoreBuilder storeBuilder(int maxCacheSize) {
        return Stores.keyValueStoreBuilder(
                Stores.lruMap(STORE_NAME, maxCacheSize),
                Serdes.String(), Serdes.String());
    }

    @Override
    public void init(ProcessorContext ctx) {
        kvStore =  (KeyValueStore<String, Object>) ctx.getStateStore(STORE_NAME);
    }

    @Override
    public Object transform(Object value) {
      //  if kvStore.get()
        return value;
    }

    @Override
    public void close() {
        if (kvStore != null) {
            kvStore.close();
        }
    }

}
