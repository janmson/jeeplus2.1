/*
 * FileName：MsgResponseVideo.java 
 * <p>
 * Copyright (c) 2017-2020, <a href="http://www.webcsn.com">hermit (794890569@qq.com)</a>.
 * <p>
 * Licensed under the GNU General Public License, Version 3 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/gpl-3.0.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.jeeplus.wxapi.vo;

import lombok.Data;

/**
 * 
 * 公众号回复给用户的消息 - 视频消息
 * 
 * 
 */

@Data
public class MsgResponseVideo extends MsgResponse{
	private static final long serialVersionUID = 6762623431582364815L;
	
	private Video Video;

	public com.jeeplus.wxapi.vo.Video getVideo() {
		return Video;
	}

	public void setVideo(com.jeeplus.wxapi.vo.Video video) {
		Video = video;
	}
}