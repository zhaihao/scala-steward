/*
 * Copyright 2018 scala-steward contributors
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

package eu.timepit.scalasteward.application

import better.files.File
import eu.timepit.scalasteward.git.Author

final case class Config(
    workspace: File,
    gitAuthor: Author = Author("Scala steward", "scala-steward@timepit.eu"),
    gitHubLogin: String = "scala-steward",
    gitHubTokenFile: File
)
