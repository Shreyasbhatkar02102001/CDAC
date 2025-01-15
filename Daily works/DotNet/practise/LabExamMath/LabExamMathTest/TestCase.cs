using LabExamMath;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LabExamMathTest
{
    [TestClass]
    public class TestCase
    {
        private MathLogic mathLogic;

        [TestInitialize]
        public void setUp()
        {
            mathLogic = new MathLogic();
        }

        [TestMethod]
        public void Addition()
        {
            int result = mathLogic.Add(20, 10);
            Assert.AreEqual(30, result);
        }

        [TestMethod]
        public void Subtraction()
        {
            int result = mathLogic.Sub(20, 10);
            Assert.AreEqual(10, result);
        }

        [TestMethod]
        public void Multiplication()
        {
            int result = mathLogic.Mul(20, 10);
            Assert.AreEqual(200, result);
        }

        [TestMethod]
        public void Division()
        {
            int result = mathLogic.Div(20, 10);
            Assert.AreEqual(2, result);
        }

    }
}
