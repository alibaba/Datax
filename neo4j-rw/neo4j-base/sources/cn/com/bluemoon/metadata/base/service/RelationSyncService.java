package cn.com.bluemoon.metadata.base.service;

import cn.com.bluemoon.metadata.base.config.CreateTypeConfig;
import java.util.List;
import java.util.Map;
import org.neo4j.driver.Driver;

/* loaded from: neo4j-base-1.0-SNAPSHOT.jar:cn/com/bluemoon/metadata/base/service/RelationSyncService.class */
public interface RelationSyncService {
    void batchSync(Driver driver, CreateTypeConfig createTypeConfig, List<Map<String, Object>> list);
}
