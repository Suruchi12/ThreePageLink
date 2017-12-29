import org.apache.hadoop.io.Text;
        import org.apache.hadoop.mapreduce.Reducer;

        import java.io.IOException;
        import java.util.*;

public class HomeworkReducer2 extends Reducer<Text, Text, Text, Text> {

    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context)
            throws IOException, InterruptedException {

        StringBuffer values_ = new StringBuffer();
        for (Text value : values)
            values_.append(value + ",");
        values_.replace(values_.length() - 1, values_.length(), "");

        context.write(key, new Text(values_.toString()));
    }
}
