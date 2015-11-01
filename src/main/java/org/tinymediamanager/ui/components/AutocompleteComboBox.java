/*
 * Copyright 2012 - 2015 Manuel Laggner
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.tinymediamanager.ui.components;

import java.util.Collection;

import javax.swing.JComboBox;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.swing.AutoCompleteSupport;

/**
 * The Class AutocompleteComboBox.
 * 
 * @author Manuel Laggner
 */
public class AutocompleteComboBox<E> extends JComboBox<E> {// implements JComboBox.KeySelectionManager {
  private static final long serialVersionUID = 6366300597464784607L;

  private EventList<E>      items;

  public AutocompleteComboBox(Collection<E> items) {
    super();
    this.items = new BasicEventList<>();
    this.items.addAll(items);
    init();
  }

  public AutocompleteComboBox(E[] items) {
    super();
    this.items = GlazedLists.eventListOf(items);
    init();
  }

  private void init() {
    setEditable(true);
    AutoCompleteSupport.install(this, items);
  }
}
