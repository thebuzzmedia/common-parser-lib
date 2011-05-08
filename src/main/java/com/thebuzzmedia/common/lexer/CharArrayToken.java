/**   
 * Copyright 2011 The Buzz Media, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.thebuzzmedia.common.lexer;

public class CharArrayToken extends AbstractToken<char[]> {
	public static final char[] EMPTY_VALUE = new char[0];

	public CharArrayToken(char[] source, int index, int length)
			throws IllegalArgumentException {
		super(source, index, length);
	}

	public String toString() {
		return new String(source, index, length);
	}

	public char[] getValue() {
		char[] value = null;

		if (length > 0) {
			value = new char[length];
			System.arraycopy(source, index, value, 0, length);
		} else
			value = EMPTY_VALUE;

		return value;
	}
}