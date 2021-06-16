echo " Welcome to batch execution"
d:
cd D:\Synechron_BDD_14-06\Eclipse_WS\actitime
set classpath=D:\Synechron_BDD_14-06\Eclipse_WS\actitime\target\*;.
mvn test -Dcucumber.filter.tags="@development"
