/*
 * Copyright 2001-2005 The Apache Software Foundation
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
package org.eredlab.g4.ccl.net.nntp;

/**
 * This class is a structure used to return article number and unique
 * id information extracted from an NNTP server reply.  You will normally
 * want this information when issuing a STAT command, implemented by
 * {@link NNTPClient#selectArticle selectArticle}.
 * @author Daniel F. Savarese
 * @see NNTPClient
 */
public final class ArticlePointer
{
    /** The number of the referenced article. */
    public int articleNumber;
    /**
     * The unique id of the referenced article, including the enclosing
     * &lt and &gt symbols which are technically not part of the
     * identifier, but are required by all NNTP commands taking an
     * article id as an argument.
     */
    public String articleId;
}