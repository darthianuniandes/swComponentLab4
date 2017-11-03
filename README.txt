 cd C:\Program Files\glassfish-4.1.1\glassfish\bin
 
 asadmin
 
 create-jdbc-connection-pool --restype javax.sql.DataSource 
 --datasourceclassname oracle.jdbc.pool.OracleDataSource 
 --property "user=hr:password=hr: url=jdbc\\:oracle\\:thin\\:@localhost\\:1521\\:xe" lab4
 
 create-jdbc-resource --connectionpoolid lab4 jdbc/MuebleDeLosAlpes
