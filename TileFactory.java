
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
tile=new JumpTile("box.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
case 1:
tile=new JumpTile("boxAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 2:
tile=new JumpTile("boxCoin.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 3:
tile=new JumpTile("boxCoin_disabled.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 4:
tile=new JumpTile("boxCoinAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 5:
tile=new JumpTile("boxCoinAlt_disabled.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 6:
tile=new JumpTile("boxEmpty.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 7:
tile=new JumpTile("boxExplosive.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 8:
tile=new JumpTile("boxExplosive_disabled.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 9:
tile=new JumpTile("boxExplosiveAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 10:
tile=new JumpTile("boxItem.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 11:
tile=new JumpTile("boxItem_disabled.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 12:
tile=new JumpTile("boxItemAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 13:
tile=new JumpTile("boxItemAlt_disabled.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 14:
tile=new JumpTile("boxWarning.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 15:
tile=new JumpTile("brickWall.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 16:
tile=new JumpTile("bridge.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 17:
tile=new JumpTile("bridgeLogs.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 18:
tile=new JumpTile("castle.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 19:
tile=new JumpTile("castleCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 20:
tile=new JumpTile("castleCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 21:
tile=new JumpTile("castleCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 22:
tile=new JumpTile("castleCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 23:
tile=new JumpTile("castleCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 24:
tile=new JumpTile("castleCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 25:
tile=new JumpTile("castleHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 26:
tile=new JumpTile("castleHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 27:
tile=new JumpTile("castleHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 28:
tile=new JumpTile("castleHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 29:
tile=new JumpTile("castleHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 30:
tile=new JumpTile("castleHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 31:
tile=new JumpTile("castleHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 32:
tile=new JumpTile("castleHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 33:
tile=new JumpTile("castleLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 34:
tile=new JumpTile("castleLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 35:
tile=new JumpTile("castleLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 36:
tile=new JumpTile("castleMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 37:
tile=new JumpTile("castleRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 38:
tile=new JumpTile("dirt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 39:
tile=new JumpTile("dirtCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 40:
tile=new JumpTile("dirtCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 41:
tile=new JumpTile("dirtCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 42:
tile=new JumpTile("dirtCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 43:
tile=new JumpTile("dirtCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 44:
tile=new JumpTile("dirtCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 45:
tile=new JumpTile("dirtHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 46:
tile=new JumpTile("dirtHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 47:
tile=new JumpTile("dirtHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 48:
tile=new JumpTile("dirtHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 49:
tile=new JumpTile("dirtHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 50:
tile=new JumpTile("dirtHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 51:
tile=new JumpTile("dirtHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 52:
tile=new JumpTile("dirtHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 53:
tile=new JumpTile("dirtLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 54:
tile=new JumpTile("dirtLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 55:
tile=new JumpTile("dirtLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 56:
tile=new JumpTile("dirtMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 57:
tile=new JumpTile("dirtRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 58:
tile=new Tile("door_closedMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 59:
tile=new Tile("door_closedTop.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 60:
tile=new Tile("door_openMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 61:
tile=new Tile("door_openTop.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 62:
tile=new Tile("fence.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 63:
tile=new Tile("fenceBroken.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 64:
tile=new JumpTile("grass.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 65:
tile=new JumpTile("grassCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 66:
tile=new JumpTile("grassCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 67:
tile=new JumpTile("grassCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 68:
tile=new JumpTile("grassCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 69:
tile=new JumpTile("grassCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 70:
tile=new JumpTile("grassCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 71:
tile=new JumpTile("grassHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 72:
tile=new JumpTile("grassHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 73:
tile=new JumpTile("grassHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 74:
tile=new JumpTile("grassHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 75:
tile=new JumpTile("grassHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 76:
tile=new JumpTile("grassHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 77:
tile=new JumpTile("grassHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 78:
tile=new JumpTile("grassHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 79:
tile=new JumpTile("grassLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 80:
tile=new JumpTile("grassLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 81:
tile=new JumpTile("grassLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 82:
tile=new JumpTile("grassMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 83:
tile=new JumpTile("grassRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 84:
tile=new JumpTile("hill_large.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 85:
tile=new JumpTile("hill_largeAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 86:
tile=new JumpTile("hill_small.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 87:
tile=new JumpTile("hill_smallAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 88:
tile=new Tile("ladder_mid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 89:
tile=new Tile("ladder_top.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 90:
tile=new Tile("liquidLava.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 91:
tile=new Tile("liquidLavaTop.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 92:
tile=new Tile("liquidLavaTop_mid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 93:
tile=new WaterTile("liquidWater.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 94:
tile=new Tile("liquidWaterTop.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 95:
tile=new Tile("liquidWaterTop_mid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 96:
tile=new Tile("lock_blue.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 97:
tile=new Tile("lock_green.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 98:
tile=new Tile("lock_red.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 99:
tile=new Tile("lock_yellow.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 100:
tile=new Tile("rockHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 101:
tile=new Tile("rockHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 102:
tile=new JumpTile("ropeAttached.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 103:
tile=new JumpTile("ropeHorizontal.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 104:
tile=new JumpTile("ropeVertical.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 105:
tile=new JumpTile("sand.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 106:
tile=new JumpTile("sandCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 107:
tile=new JumpTile("sandCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 108:
tile=new JumpTile("sandCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 109:
tile=new JumpTile("sandCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 110:
tile=new JumpTile("sandCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 111:
tile=new JumpTile("sandCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 112:
tile=new JumpTile("sandHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 113:
tile=new JumpTile("sandHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 114:
tile=new JumpTile("sandHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 115:
tile=new JumpTile("sandHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 116:
tile=new JumpTile("sandHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 117:
tile=new JumpTile("sandHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 118:
tile=new JumpTile("sandHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 119:
tile=new JumpTile("sandHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 120:
tile=new JumpTile("sandLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 121:
tile=new JumpTile("sandLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 122:
tile=new JumpTile("sandLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 123:
tile=new JumpTile("sandMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 124:
tile=new JumpTile("sandRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 125:
tile=new Tile("sign.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 126:
tile=new Tile("signExit.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 127:
tile=new Tile("signLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 128:
tile=new Tile("signRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 129:
tile=new JumpTile("snow.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 130:
tile=new JumpTile("snowCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 131:
tile=new JumpTile("snowCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 132:
tile=new JumpTile("snowCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 133:
tile=new JumpTile("snowCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 134:
tile=new JumpTile("snowCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 135:
tile=new JumpTile("snowCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 136:
tile=new JumpTile("snowHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 137:
tile=new JumpTile("snowHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 138:
tile=new JumpTile("snowHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 139:
tile=new JumpTile("snowHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 140:
tile=new JumpTile("snowHillLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 141:
tile=new JumpTile("snowHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 142:
tile=new JumpTile("snowHillRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 143:
tile=new JumpTile("snowHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 144:
tile=new JumpTile("snowLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 145:
tile=new JumpTile("snowLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 146:
tile=new JumpTile("snowLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 147:
tile=new JumpTile("snowMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 148:
tile=new JumpTile("snowRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 149:
tile=new JumpTile("stone.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 150:
tile=new JumpTile("stoneCenter.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 151:
tile=new JumpTile("stoneCenter_rounded.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 152:
tile=new JumpTile("stoneCliffLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 153:
tile=new JumpTile("stoneCliffLeftAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 154:
tile=new JumpTile("stoneCliffRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 155:
tile=new JumpTile("stoneCliffRightAlt.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 156:
tile=new JumpTile("stoneHalf.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 157:
tile=new JumpTile("stoneHalfLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 158:
tile=new JumpTile("stoneHalfMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 159:
tile=new JumpTile("stoneHalfRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 160:
tile=new JumpTile("stoneHillLeft2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 161:
tile=new JumpTile("stoneHillRight2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 162:
tile=new JumpTile("stoneLedgeLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 163:
tile=new JumpTile("stoneLedgeRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 164:
tile=new JumpTile("stoneLeft.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 165:
tile=new JumpTile("stoneMid.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 166:
tile=new JumpTile("stoneRight.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 167:
tile=new JumpTile("stoneWall.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 168:
tile=new Tile("tochLit.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 169:
tile=new Tile("tochLit2.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = false;
break;
case 170:
tile=new Tile("torch.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
case 171:
tile=new JumpTile("window.png",TileEngine.TILE_WIDTH,TileEngine.TILE_HEIGHT);
tile.isSolid = true;
break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    
    }
}
