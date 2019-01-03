mvn install:install-file -Dfile=alipay-sdk-java20170324180803.jar -DgroupId=com.alipay -DartifactId=alipay-sdk-java -Dversion=1.0.0 -Dpackaging=jar


java -jar  -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -Xmn360m -XX:+PrintGCDetails -XX:MetaspaceSize=128m -XX:MaxMetaspaceSize=258m  -Xloggc:/opt/web/service/log/gc_log.log -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/opt/web/service/log/dump landison-0.0.1-SNAPSHOT.jar --spring.profiles.active=test &

#gc调优
 jps
 jmap -heap <pid>
 jstack <pid>
 jstat -gc <pid>
 jinfo <pid>
 gcViewer

#apache-cxf-3.2.6
wsdl2java.bat -autoNameResolution -encoding utf-8 -p com.medwin.landison.kms.profileservice -d E:/github/landison/src/main/java http://116.62.146.178:9000/KWS_TRAIN/ProfileService.asmx?wsdl
wsdl2java.bat -b jaxb-binding-date.xml -autoNameResolution -encoding utf-8 -p com.medwin.landison.kms.reservationservice -d E:/github/landison/src/main/java http://116.62.146.178:9000/KWS_TRAIN/ReservationService.asmx?wsdl
wsdl2java.bat -b jaxb-binding-date.xml -autoNameResolution -encoding utf-8 -p com.medwin.landison.kms.availabilityservice -d E:/github/landison/src/main/java http://116.62.146.178:9000/KWS_TRAIN/AvailabilityService.asmx?wsdl