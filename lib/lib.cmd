mvn install:install-file -Dfile=alipay-sdk-java20170324180803.jar -DgroupId=com.alipay -DartifactId=alipay-sdk-java -Dversion=1.0.0 -Dpackaging=jar


java -jar  -XX:+UseConcMarkSweepGC -Xms256m -Xmx512m -XX:+PrintGCDetails -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=258m  -Xloggc:/opt/web/service/log/gc_log.log
 landison-0.0.1-SNAPSHOT.jar &

#gc调优
 jps
 jmap -heap <pid>
 jstack <pid>
 jstat -gc <pid>
 jinfo <pid>
 gcViewer