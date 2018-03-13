package com.commonsware.empublite;

/**
 * Created by JCL on 13-Mar-18.
 */

public class BookLoadedEvent {
    private BookContents contents=null;
    public BookLoadedEvent(BookContents contents) {
        this.contents=contents;
    }
    public BookContents getBook() {
        return(contents);
    }
}
