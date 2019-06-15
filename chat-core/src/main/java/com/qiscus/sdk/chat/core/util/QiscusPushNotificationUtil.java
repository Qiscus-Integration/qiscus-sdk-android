/*
 * Copyright (c) 2016 Qiscus.
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

package com.qiscus.sdk.chat.core.util;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationManagerCompat;

import com.qiscus.sdk.chat.core.data.local.QiscusCacheManager;

/**
 * Created on : June 15, 2017
 * Author     : zetbaitsu
 * Name       : Zetra
 * GitHub     : https://github.com/zetbaitsu
 */
@RestrictTo(RestrictTo.Scope.LIBRARY)
public final class QiscusPushNotificationUtil {

    private QiscusPushNotificationUtil() {
    }

    public static void clearPushNotification(Context context, long roomId) {
        NotificationManagerCompat.from(context).cancel(QiscusNumberUtil.convertToInt(roomId));
        QiscusCacheManager.getInstance().clearMessageNotifItems(roomId);
    }
}
