package com.docdoku.daggerappsample;

import com.docdoku.daggerappsample.ui.books.BooksPresenter;
import com.docdoku.daggerappsample.ui.books.IBooksPresenter;
import com.docdoku.daggerappsample.ui.books.IBooksView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BooksPresenterTest {

    private IBooksPresenter mPresenter;

    @Before
    public void setUp() {
        mPresenter = new BooksPresenter();
    }

    @Test
    public void notifyDataChangedCalled() throws Exception {
        IBooksView view = Mockito.mock(IBooksView.class);
        mPresenter.bind(view);
        mPresenter.loadBooks();
        verify(view, times(1)).notifyDataChanged();
    }
}