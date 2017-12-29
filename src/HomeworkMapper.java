import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import org.apache.commons.logging.Log;
// import org.apache.commons.logging.LogFactory;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

public class HomeworkMapper extends Mapper<Text, Text, Text, Text>{

    @Override
    protected void map(Text key, Text value, Context context)
            throws IOException, InterruptedException {
        context.write(key, new Text(key + "," + value));
        context.write(value, new Text(key + "," + value));
    }
}
