// Databricks notebook source
spark.conf.set("dfs.adls.oauth2.access.token.provider.type", "ClientCredential")
spark.conf.set("dfs.adls.oauth2.client.id", "a4134cc1-db28-45b7-852d-2191e6dddbc7")
spark.conf.set("dfs.adls.oauth2.credential", "upxEMcWVfURO/ioo2NvFz33ypdNjS47SNOZwDxDzYOE=")
spark.conf.set("dfs.adls.oauth2.refresh.url", "https://login.microsoftonline.com/72f988bf-86f1-41af-91ab-2d7cd011db47/oauth2/token")

val df = spark.read.csv("adl://adlsanalytic1.azuredatalakestore.net/30_hourSummary.csv")
display(df)
df.count()

// COMMAND ----------

