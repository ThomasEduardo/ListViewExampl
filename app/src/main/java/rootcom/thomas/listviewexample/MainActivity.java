package rootcom.thomas.listviewexample;

import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

public class MainActivity extends Activity  implements TextWatcher{
    List<String> names;
    ArrayAdapter<String> adapter;
    EditText editName;
    ListView listNames;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editTxt);
        listNames = (ListView) findViewById(R.id.listNames);
        names = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        listNames.setAdapter(adapter);
        names.add("Tomás Edurado");
        names.add("Funny Vieira");
        names.add("Taiany Luyça");
        names.add("Hailla Medeirus");
        names.add("Artúh Ferrau1");
        editName.addTextChangedListener(this);
    }
    @Override
    public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {
    }
    @Override
    public void onTextChanged(CharSequence s, int i, int i1, int i2) {
        adapter.getFilter().filter(s);
    }
    @Override
    public void afterTextChanged(Editable editable) {
    }

}