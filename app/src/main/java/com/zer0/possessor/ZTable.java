package com.zer0.possessor;

public class ZTable
{
	public final static long[] bufferLong = new long[128];
	public final static byte buffer[] = {
            -32,62,-48,-70,-102,-42,-86,114,-17,-49,-38,54,120,-61,35,-30,
            -11,104,-49,90,-45,118,-16,104,40,48,-3,-84,-19,-95,23,-117,
            32,-101,-33,-123,95,84,65,-28,-4,45,12,42,-113,18,77,-59,
            18,56,89,-39,12,93,-55,34,-78,-21,125,81,-36,-25,111,110,
            95,-19,-42,-34,-13,12,-44,-41,-52,-2,-108,108,-128,-86,69,76,
            24,88,-30,114,-29,-72,-121,-91,58,-87,83,106,-11,-11,-96,-62,
            -95,-12,-105,21,-68,-54,-101,2,76,-87,-92,-76,-108,124,46,-27,
            -100,115,78,-14,4,52,20,-36,-54,98,-112,-12,54,-75,61,106,
            35,83,80,52,-35,-20,88,-22,-14,-79,112,-89,74,-54,-67,68,
            -13,-16,54,99,-81,-102,-75,34,27,47,-92,-104,9,13,28,-47,
            94,48,-42,24,71,-32,120,-61,-102,65,101,-79,-69,35,-88,27,
            -74,-73,-17,-2,-15,-19,33,-112,-4,-6,-76,32,-12,120,-17,12,
            -34,17,122,106,122,-23,-35,-62,60,107,-70,116,71,29,103,36,
            97,-69,-15,32,59,125,29,6,-16,-117,-4,110,-1,-74,-59,-114,
            -17,-27,79,-88,7,75,121,25,36,30,16,23,-11,-64,124,28,
            40,17,97,8,27,11,-90,73,36,24,26,76,-95,85,103,-17,
            -86,16,-117,84,13,-97,-56,66,-90,106,27,-22,-101,51,12,-21,
            100,67,127,-63,47,84,-123,52,109,-6,124,27,-116,-24,-107,-56,
            60,-105,89,-44,-125,-32,-15,-69,-32,30,87,67,24,-122,14,-58,
            27,-32,73,91,-7,-19,118,40,-42,-46,-71,19,-66,-67,-104,33,
            63,70,-33,42,-12,1,76,61,88,49,64,123,80,25,118,-74,
            -29,-124,-2,24,-95,4,41,14,92,-67,89,41,56,-19,62,-36,
            -71,-92,-89,8,88,3,-22,55,92,89,-11,-111,-47,-13,-9,60,
            96,122,-15,47,48,17,-2,-77,93,-7,-99,-7,121,-14,127,-103,
            87,9,68,36,-90,-41,-75,-3,-114,-17,11,119,-106,-103,101,-127,
            -46,-40,61,-84,-105,17,97,18,-53,93,-25,97,-52,91,-25,117,
            95,-96,14,37,77,-75,-66,-44,25,-106,99,-78,-58,56,59,-54,
            -92,46,-55,44,127,-80,-104,9,-53,-32,-55,0,-112,37,-45,-42,
            -81,96,-58,1,-111,39,4,106,-86,5,56,-42,75,76,-112,-71,
            -66,-42,-120,28,-15,11,-31,-5,24,-46,40,34,103,19,-50,-78,
            13,3,27,-106,-29,82,-119,-26,77,-82,-123,-121,10,-116,93,18,
            -95,65,10,-75,60,113,30,-16,-25,45,-28,39,-61,-49,96,-11};
	static {
		int pos = 0;
		
		for (int i = 0; i < 512; ) {
			int MASK = 0xFF;
			long result = ZTable.buffer[i++] & MASK;
		        result = result + ((ZTable.buffer[i++] & MASK) << 8);
		        result = result + ((ZTable.buffer[i++] & MASK) << 16);
		        result = result + ((ZTable.buffer[i++] & MASK) << 24);
			ZTable.bufferLong[pos++] = result;
		}
	}
}