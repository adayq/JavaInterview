package nine;

import java.util.UUID;

/**
 * @author Lenovo
 */
public class UUIDTest {

    public static void main(String[] args) {
        /**
         * 优点：
         * 生产足够简单，本地生产无网络消耗，具有唯一性
         * 缺点：
         * 无序的字符串，不具备趋势自增性
         * 没有具体的业务含义
         * 长度过长，存储mysql 对数据库的性能消耗比较大
         */
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.println(uuid);

        /**
         * 基于数据库自增的id
         * 优点：实现简单，id单调自增，数值类型查询速度快
         * 缺点：DB单点存储存在宕机风险，无法扛住高并发场景
         */

        /**
         * 基于数据库集群模式
         * 优点：解决DB单点的问题
         * 缺点：不利于后续扩充
         */

        /**
         * 基于数据库的号段模式
         * 采用版本号乐观锁的方式更新，这种分布式id生产方式不强依赖于数据库，不会频繁的访问数据库，对数据库压力小很多
         */

        /**
         * 基于redis模式：
         * 受redis 持久化影响  aof 和 rdb
         * 优点：
         * 缺点：
         */

        /**
         * 基于雪花算法：
         *
         */

        /**
         * 百度
         */

        /**
         * 美团
         */

    }
}
