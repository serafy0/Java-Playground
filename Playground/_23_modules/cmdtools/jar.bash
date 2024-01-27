for i in mod*
do
        (cd $i; jar cf ../${i}.jar .; )
done