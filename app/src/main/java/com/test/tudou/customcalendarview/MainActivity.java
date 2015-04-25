package com.test.tudou.customcalendarview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.test.tudou.library.DatePickerController;
import com.test.tudou.library.DayPickerView;
import com.test.tudou.library.SimpleMonthAdapter;

public class MainActivity extends ActionBarActivity implements DatePickerController {

  @InjectView(R.id.pickerView) DayPickerView mDayPickerView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.inject(this);

    mDayPickerView.setController(this);
  }

  @Override public int getMaxYear() {
    return 2015;
  }

  @Override public void onDayOfMonthSelected(int year, int month, int day) {

  }

  @Override public void onDateRangeSelected(
      SimpleMonthAdapter.SelectedDays<SimpleMonthAdapter.CalendarDay> selectedDays) {

  }
}
