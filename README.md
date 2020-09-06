# Wither_Craft
## 概要
> 他のモブと違って、ウィザーって能動的にしか出現しないし、実質、最弱モブなのでは？

という一言から作られたプラグインです。このプラグインを使うと、ウィザーがワールドに一定確率でスポーンするようになります。
このプラグインの導入により、特に装備が整っていない初期は、非常に厳しい戦いとなるでしょう。

## config.ymlについて
初回起動時にpluginsフォルダ内のWither_Craftフォルダ内に生成される config.yml で各種設定を行うことが出来ます。
config.yml には次の3つの項目が記載されています。

 - **probability**  
 ウィザーがスポーンする確率を記載します。0から100までの値を記載することが出来ます。また、小数点の記述にも対応しています。
 デフォルトでは1％の確率でスポーンします。
 
 - **EntityThreshold**    
 ウィザーがスポーンする条件を設定します。0または1または2の値を取ることが出来ます。
 簡単に言えば、このプラグインの難易度を選択できる項目で、大きくなるほど難しくなります。  
 ウィザーは他のエンティティが発生する際、抽選が行われ、スポーンします。そのトリガーとなるエンティティの種類を指定することが出来ます。
 値が0の場合、「モンスター」がスポーンした際に、値が1の場合、「モブ」がスポーンした際に、値が2の場合、「エンティティ」がスポーンした際に抽選が行われます。  
 なお、3以上の値を記載すると、「エンティティ」がウィザーのスポーン条件となり、-1以下の値を記載すると、ウィザーは召喚されなくなります。  
 デフォルトでは0となっています。

 - **chain**  
 ウィザーがスポーンした際、連続して抽選を行うか設定します。TRUEまたはFALSEを記載できます。
 FALSEの場合、ウィザーがスポーンしても、追加でウィザーをスポーンさせるかの抽選は行われませんが、
 TRUEの場合、再度抽選を行います。これにより、同時に2体、3体スポーンする可能性があります。  
 デフォルトではTRUEです。
 
なお、 config.yml を書き換えた際は、サーバーの再起動（または `/reload` コマンド）を行ってください。

## その他
 - 「モンスター」がスポーン条件となっている場合、以下のモンスターがスポーンしたとき、追加でウィザーがスポーンされる場合があります。  
 <details><summary>クリックで表示</summary><div>
 
 ```
 Blaze
 CaveSpider
 Creeper
 Drowned
 ElderGuardian
 Enderman
 Endermite
 Evoker
 Giant
 Guardian
 Husk
 Illager
 Illusioner
 PiglinBrute
 PigZombie
 Pillager
 Raider
 Ravager
 Silverfish
 Skeleton
 Spellcaster
 Spider
 Stray
 Vex
 Vindicator
 Witch
 Wither (chainがTRUEのときのみ)
 WitherSkeleton
 Zoglin
 Zombie
 ZombieVillager
```
</div></details>

 - 「モブ」がスポーン条件となっている場合、以下のモブがスポーンしたとき、追加でウィザーがスポーンされる場合があります。  
 <details><summary>クリックで表示</summary><div>
 
 ```
 Bat
 Bee
 Blaze
 Cat
 CaveSpider
 ChestedHorse
 Chicken
 Cod
 Cow
 Creeper
 Dolphin
 Donkey
 Drowned
 ElderGuardian
 Enderman
 Endermite
 Evoker
 Fish
 Fox
 Ghast
 Giant
 Golem
 Guardian
 Hoglin
 Horse
 Husk
 Illager
 Illusioner
 IronGolem
 Llama
 MagmaCube
 Mule
 MushroomCow
 Panda
 Parrot
 Phantom
 Pig
 Piglin
 PiglinBrute
 PigZombie
 Pillager
 PolarBear
 PufferFish
 Rabbit
 Ravager
 Salmon
 Sheep
 Shulker
 Silverfish
 Skeleton
 SkeletonHorse
 Slime
 Snowman
 Spellcaster
 Spider
 Squid
 Stray
 Strider
 TraderLlama
 TropicalFish
 Turtle
 Vex
 Villager
 Vindicator
 WanderingTrader
 Witch
 Wither (chainがTRUEのときのみ)
 WitherSkeleton
 Wolf
 Zoglin
 Zombie
 ZombieHorse
 ZombieVillager
```
</div></details>

 - 「エンティティ」がスポーン条件となっている場合、すべてのエンティティが発生したとき、追加でウィザーがスポーンされる場合があります。
 ただし、「ウィザーの頭蓋骨」のみ、発生しても、抽選は行われません。   
 
 - 「エンティティ」をウィザーの発生条件とした場合、スポーン確率を十分に下げるよう注意してください。
 そうでない場合、マインクラフトが非常に重くなり、クラッシュする場合があります。
 
 
## 動作確認済
- Java 13  
CraftBukkit 1.16.2
 
## ダウンロード
- [ ダウンロードはこちら ](https://github.com/kasumi-29/Wither_Craft/releases/tag/v2.1.0)
