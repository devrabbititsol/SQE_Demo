source ~/.bash_rc
cd /home/devrabbit/SmartQE/SmartQE-Users/7/Selenium/SQE_Demo
curl -d @config543.xml -H 'Content-Type: text/xml' 'http://devrabbit:rabbit@192.168.1.141:8080/createItem?name=SQE_Demo' --user devrabbit:114de69b453efd3524fce8756b1ed0e69c
curl -X POST http://devrabbit:rabbit@192.168.1.141:8080/job/SQE_Demo/config.xml --user devrabbit:114de69b453efd3524fce8756b1ed0e69c --data-binary @config543.xml
curl -X POST http://devrabbit:rabbit@192.168.1.141:8080/job/SQE_Demo/build --user devrabbit:114de69b453efd3524fce8756b1ed0e69c
