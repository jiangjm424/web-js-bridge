/*
 * Copyright 2022 The Jmdroid Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jm.droid.lib.bridge.iplugin

import jm.droid.lib.bridge.resp.JsCommonReq

interface JsInvokeBridge {
    /**
     * 由h5下发的调用事件
     * @param method 对应类的方法名
     * @param reqId  此次请求的id
     * @param params 请求参数
     * @param callback 请求回包异常返回
     */
    fun dispatchJsEvent(method: String, request: JsCommonReq): String
}
