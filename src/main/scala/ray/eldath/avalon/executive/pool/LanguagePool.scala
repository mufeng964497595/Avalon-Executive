package ray.eldath.avalon.executive.pool

import java.util

import ray.eldath.avalon.executive.model.Language

object LanguagePool {
  private val idToLanguage = new util.HashMap[String, Language]

  idToLanguage.put("cpp11",
    new Language("cpp11", "c++11", "g++ -O2 -Wall -std=c++11 -o {file}.exe {file}.cc -lm", "./{file}.exe"))
  idToLanguage.put("py",
    new Language("py", "python3", "python -m py_compile {file}.py", "python {file}.py"))

  def getById(id: String): Language = idToLanguage.get(id)

  def getMap: util.Map[String, Language] = idToLanguage

  def getAllLanguage = new util.ArrayList[Language](idToLanguage.values)
}