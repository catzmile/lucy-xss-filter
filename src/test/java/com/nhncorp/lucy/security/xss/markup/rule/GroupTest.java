/*
 *	Copyright 2014 Naver Corp.
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package com.nhncorp.lucy.security.xss.markup.rule;

import static junit.framework.Assert.*;

import org.junit.Test;

public class GroupTest {
	@Test
	public void testNull() {
		Group group = new Group(null);
		assertEquals("", group.getRuleName());
		assertNull(group.getOperator());
		assertNull(Group.OPERATOR.getValue('t'));

		group.add(null);
		group.addAll(null);
		group.remove(null);
		assertEquals(-1, group.matchPos(null, null));
		assertEquals(-1, group.matchPos(null, ParsingGrammar.getInstance()));
		assertNotNull(group.getFirstNonOptTerminals(ParsingGrammar.getInstance()));
	}
}
