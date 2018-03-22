package com.docdoku.daggerappsample;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import com.docdoku.daggerappsample.ui.bookdetails.BookDetailsActivity;
import com.docdoku.daggerappsample.ui.books.BooksActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowApplication;

import static org.junit.Assert.assertEquals;

/**
 * Created by romainz on 21/03/18.
 */
@RunWith(RobolectricTestRunner.class)
public class BooksActivityTest {

    @Test
    public void clickItemViewShouldStartDetailsActivity() {
        BooksActivity activity = Robolectric.setupActivity(BooksActivity.class);
        RecyclerView recyclerView = activity.findViewById(R.id.rv_list_images);
        recyclerView.findViewHolderForAdapterPosition(0).itemView.performClick();

        Intent expectedIntent = new Intent(activity, BookDetailsActivity.class);
        Intent actual = ShadowApplication.getInstance().getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }
}
