import unittest

from random import randint

from Solution import Solution


class TestSolution(unittest.TestCase):
    sol = Solution()

    def test_null(self):
        self.assertIsNone(self.sol.findMin(None))

    def test_unrotated(self):
        for test_case in xrange(0, 20):
            test_array = self.genRandomArray(20)
            min = test_array[0]
            self.assertEqual(self.sol.findMin(test_array), min)

    def test_rotated(self):
        for test_case in xrange(0, 20):
            test_array = self.genRandomArray(20)
            min = test_array[0]
            test_array = self.rotateArray(test_array, randint(0, 20))
            self.assertEqual(self.sol.findMin(test_array), min)

    def genRandomArray(self, length):
        test_array = [0] * length
        for i in xrange(length):
            test_array[i] = randint(0, 100)
        return sorted(test_array)

    def rotateArray(self, array, pos):
        return array[pos + 1:] + array[0:pos + 1]


def suite1():
    suite1 = unittest.TestSuite()
    suite1.addTest(TestSolution("test_null"))
    suite1.addTest(TestSolution("test_unrotated"))
    suite1.addTest(TestSolution("test_rotated"))

if __name__ == "__main__":
    runner = unittest.TextTestRunner()
    runner.run(suite1)







