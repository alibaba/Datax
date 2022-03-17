ShellDir="$( cd "$( dirname "$0"  )" && pwd  )"
cd $ShellDir
rm -rf target
mvn -U -pl starrockswriter -am clean package assembly:assembly -Dmaven.test.skip=true
rm -f starrockswriter.tar.gz
cd target/datax/datax/plugin/writer/
tar -czvf starrockswriter.tar.gz starrockswriter
mv starrockswriter.tar.gz $ShellDir