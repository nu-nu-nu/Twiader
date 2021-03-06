/*
 * Copyright 2016  Andrii Lisun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.jydimir.twiader.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class LobsterTextView extends TextView {
    public LobsterTextView(Context context) {
        super(context);
        setFontType(context);
    }

    public LobsterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontType(context);
    }

    public LobsterTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontType(context);
    }

    private void setFontType(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(),
                "fonts/lobster_regular.ttf");
        setTypeface(typeFace);
    }
}
